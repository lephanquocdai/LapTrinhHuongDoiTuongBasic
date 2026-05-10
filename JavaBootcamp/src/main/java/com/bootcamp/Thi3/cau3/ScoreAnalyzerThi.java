package com.bootcamp.Thi3.cau3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreAnalyzerThi {
    public List<Double> topPassedScores(List<Double> scores, double passMark){
        return scores.stream().filter(score-> score >= passMark)
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .collect(Collectors.toList());
    }

    public double average(List<Double> scores){
        if (scores == null || scores.isEmpty()) {
            throw new IllegalArgumentException("Danh sach rong");
        }
        return scores.stream().mapToDouble(Double::doubleValue)
                .average().orElse(0);

    }
}
