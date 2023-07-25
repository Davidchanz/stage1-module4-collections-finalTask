package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new TreeSet<>();
        timetable.values().forEach(lessons::addAll);
        return lessons;
    }
}
