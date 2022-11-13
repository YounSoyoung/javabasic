package org.example.poly;

import org.example.encap.Dancer;
import org.example.inherit.IdolDancer;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTeam {
    private List<Dancer> idolDancers = new ArrayList<>();

    //팀원 추가하기
    public void addDancer(Dancer dancer){
        idolDancers.add(dancer);
        System.out.println(dancer + "가 추가됨!");
    }
}
