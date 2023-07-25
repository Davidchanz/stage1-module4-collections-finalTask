package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        projects.forEach((project, developers) -> {
            if(developers.contains(developer)){
                result.add(project);
            }
        });
        result.sort((v1, v2) -> {
            Comparator<Integer> lengthComp = Comparator.reverseOrder();
            int res = lengthComp.compare(v1.length(), v2.length());
            if(res == 0){
                Comparator<String> alphabeticalComp = Comparator.reverseOrder();
                return alphabeticalComp.compare(v1, v2);
            }else
                return res;
        });

        return result;
    }
}
