package com.qligent.point.count;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.qligent.point.count.dto.Input;
import com.qligent.point.count.dto.Point;
import com.qligent.point.count.dto.Region;
import com.qligent.point.count.service.PointCountService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PointCountServiceTest {

    @Autowired
    private PointCountService pointCountService;

    // TODO: This is an example of test. Remove of rewrite it in the future.
    @Test
    void pointCount() {
        List<Point> points = List.of(new Point(1, 2), new Point(3, 4), new Point(10, 12));

        Input input = Input.builder()
                .initialPoint(new Point(3, 3))
                .radius(2)
                .region(createRegion(1, 4, 3, 2))
                .points(points)
                .build();

        int count = pointCountService.pointCount(input);

        assertEquals(Integer.MAX_VALUE, count);
    }

    private Region createRegion(int leftUpperX, int leftUpperY, int rightDownX, int rightDownY) {
        return Region.builder()
                .leftUpperCorner(new Point(leftUpperX, leftUpperY))
                .rightDownCorner(new Point(rightDownX, rightDownY))
                .build();
    }
}
