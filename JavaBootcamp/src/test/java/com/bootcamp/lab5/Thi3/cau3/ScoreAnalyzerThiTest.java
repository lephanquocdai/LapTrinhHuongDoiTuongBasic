package com.bootcamp.lab5.Thi3.cau3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.bootcamp.Thi3.cau3.ScoreAnalyzerThi;

public class ScoreAnalyzerThiTest {
    ScoreAnalyzerThi analyzer = new ScoreAnalyzerThi();

    @Test
    void testTopPassedScores_NormalCase(){
        List<Double> scores = Arrays.asList(9.0, 7.5, 8.5, 6.0, 10.0, 8.0);
        List<Double> expected = Arrays.asList(10.0, 9.0, 8.5);
        List<Double> actual = analyzer.topPassedScores(scores, 7.0);
        assertIterableEquals(expected,actual);
    }

    @Test
    void testTopPassedScores_NoPassed(){
        List<Double> scores = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> expected = Collections.emptyList();
        List<Double> actual = analyzer.topPassedScores(scores, 5.0);
        assertIterableEquals(expected,actual);
    }

    @Test
    void testTopPassedScores_EqualPassMark(){
        List<Double> scores = Arrays.asList(5.0, 7.0, 8.0);
        List<Double> expected =  Arrays.asList(8.0, 7.0);
        List<Double> actual = analyzer.topPassedScores(scores, 7.0);
        assertIterableEquals(expected,actual);
    }

    @Test
    void testAverage_NormalCase(){
        List<Double> scores = Arrays.asList(8.0, 9.0, 7.0);
        double actual = analyzer.average(scores);
        assertEquals(8.0,actual);
    }

    @Test
    void testAverage_EmptyList(){
        List<Double> scores = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> analyzer.average(scores));
    }
}
