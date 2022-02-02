package cse.project.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ratingService.proto")
public final class RatingServiceGrpc {

  private RatingServiceGrpc() {}

  public static final String SERVICE_NAME = "RatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cse.project.grpc.ProductRequest,
      cse.project.grpc.ApiResponse> getRateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RateProduct",
      requestType = cse.project.grpc.ProductRequest.class,
      responseType = cse.project.grpc.ApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cse.project.grpc.ProductRequest,
      cse.project.grpc.ApiResponse> getRateProductMethod() {
    io.grpc.MethodDescriptor<cse.project.grpc.ProductRequest, cse.project.grpc.ApiResponse> getRateProductMethod;
    if ((getRateProductMethod = RatingServiceGrpc.getRateProductMethod) == null) {
      synchronized (RatingServiceGrpc.class) {
        if ((getRateProductMethod = RatingServiceGrpc.getRateProductMethod) == null) {
          RatingServiceGrpc.getRateProductMethod = getRateProductMethod = 
              io.grpc.MethodDescriptor.<cse.project.grpc.ProductRequest, cse.project.grpc.ApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RatingService", "RateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cse.project.grpc.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cse.project.grpc.ApiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RatingServiceMethodDescriptorSupplier("RateProduct"))
                  .build();
          }
        }
     }
     return getRateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cse.project.grpc.RatingRequest,
      cse.project.grpc.RatingResponse> getGetProductRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductRating",
      requestType = cse.project.grpc.RatingRequest.class,
      responseType = cse.project.grpc.RatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cse.project.grpc.RatingRequest,
      cse.project.grpc.RatingResponse> getGetProductRatingMethod() {
    io.grpc.MethodDescriptor<cse.project.grpc.RatingRequest, cse.project.grpc.RatingResponse> getGetProductRatingMethod;
    if ((getGetProductRatingMethod = RatingServiceGrpc.getGetProductRatingMethod) == null) {
      synchronized (RatingServiceGrpc.class) {
        if ((getGetProductRatingMethod = RatingServiceGrpc.getGetProductRatingMethod) == null) {
          RatingServiceGrpc.getGetProductRatingMethod = getGetProductRatingMethod = 
              io.grpc.MethodDescriptor.<cse.project.grpc.RatingRequest, cse.project.grpc.RatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RatingService", "GetProductRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cse.project.grpc.RatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cse.project.grpc.RatingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RatingServiceMethodDescriptorSupplier("GetProductRating"))
                  .build();
          }
        }
     }
     return getGetProductRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RatingServiceStub newStub(io.grpc.Channel channel) {
    return new RatingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RatingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RatingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void rateProduct(cse.project.grpc.ProductRequest request,
        io.grpc.stub.StreamObserver<cse.project.grpc.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRateProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductRating(cse.project.grpc.RatingRequest request,
        io.grpc.stub.StreamObserver<cse.project.grpc.RatingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cse.project.grpc.ProductRequest,
                cse.project.grpc.ApiResponse>(
                  this, METHODID_RATE_PRODUCT)))
          .addMethod(
            getGetProductRatingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cse.project.grpc.RatingRequest,
                cse.project.grpc.RatingResponse>(
                  this, METHODID_GET_PRODUCT_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class RatingServiceStub extends io.grpc.stub.AbstractStub<RatingServiceStub> {
    private RatingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void rateProduct(cse.project.grpc.ProductRequest request,
        io.grpc.stub.StreamObserver<cse.project.grpc.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductRating(cse.project.grpc.RatingRequest request,
        io.grpc.stub.StreamObserver<cse.project.grpc.RatingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RatingServiceBlockingStub extends io.grpc.stub.AbstractStub<RatingServiceBlockingStub> {
    private RatingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cse.project.grpc.ApiResponse rateProduct(cse.project.grpc.ProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getRateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public cse.project.grpc.RatingResponse getProductRating(cse.project.grpc.RatingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RatingServiceFutureStub extends io.grpc.stub.AbstractStub<RatingServiceFutureStub> {
    private RatingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RatingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cse.project.grpc.ApiResponse> rateProduct(
        cse.project.grpc.ProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cse.project.grpc.RatingResponse> getProductRating(
        cse.project.grpc.RatingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RATE_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT_RATING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RATE_PRODUCT:
          serviceImpl.rateProduct((cse.project.grpc.ProductRequest) request,
              (io.grpc.stub.StreamObserver<cse.project.grpc.ApiResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_RATING:
          serviceImpl.getProductRating((cse.project.grpc.RatingRequest) request,
              (io.grpc.stub.StreamObserver<cse.project.grpc.RatingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cse.project.grpc.RatingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RatingService");
    }
  }

  private static final class RatingServiceFileDescriptorSupplier
      extends RatingServiceBaseDescriptorSupplier {
    RatingServiceFileDescriptorSupplier() {}
  }

  private static final class RatingServiceMethodDescriptorSupplier
      extends RatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RatingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RatingServiceFileDescriptorSupplier())
              .addMethod(getRateProductMethod())
              .addMethod(getGetProductRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
