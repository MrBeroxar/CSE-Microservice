package cse.project.ratingservice;

import cse.project.grpc.ApiResponse;
import cse.project.grpc.ProductRequest;
import cse.project.grpc.RatingRequest;
import cse.project.grpc.RatingResponse;
import cse.project.grpc.RatingServiceGrpc.RatingServiceImplBase;
import cse.project.persistence.PersistenceService;
import io.grpc.stub.StreamObserver;

public class RatingService extends RatingServiceImplBase{
	
	private PersistenceService persistenceService = new PersistenceService();
	@Override
	public void rateProduct(ProductRequest request, StreamObserver<ApiResponse> responseObserver) {
		
		persistenceService.saveProductRating(request.getProductId(), request.getRating());
		ApiResponse.Builder response = ApiResponse.newBuilder();
		
		response.setResponseMessage("SUCCESS: Rating saved");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getProductRating(RatingRequest request, StreamObserver<RatingResponse> responseObserver) {
		
		RatingResponse.Builder response = RatingResponse.newBuilder();
		
		response.setRating(persistenceService.getProductRating(request.getProductId()));
		response.setResponseMessage("SUCESS: Rating send");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
	
}
