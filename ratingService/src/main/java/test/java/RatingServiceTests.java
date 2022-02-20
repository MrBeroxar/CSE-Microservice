package test.java;
import hipstershop.persistence.PersistenceService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class RatingServiceTests {

    static final PersistenceService p = new PersistenceService();

    @Test
    void getProductRatingTest() {
        assertThat(p.getProductRating("testId")).isEqualTo(1d);
    }

    @Test
    void getProductCountTest() {
        assertThat(p.getNumberOfProductRatings("testId")).isEqualTo(1);

    }

    @Test
    void getShopRatingTest() {
        assertThat(p.getShopRating()).isNotEqualTo(0);
        assertThat(p.getShopRating()).isNotNegative();
    }

    @Test
    void getShopCountTest() {
        assertThat(p.getNumberOfShopRatings()).isNotEqualTo(0);
        assertThat(p.getNumberOfShopRatings()).isNotNegative();
    }

}



