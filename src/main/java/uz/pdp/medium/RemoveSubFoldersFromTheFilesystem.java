package uz.pdp.medium;
//1233. Remove Sub-Folders from the Filesystem
//Medium
//        Topics
//Companies
//        Hint
//Given a list of folders folder, return the folders after removing all sub-folders in those folders. You may return the answer in any order.
//
//If a folder[i] is located within another folder[j], it is called a sub-folder of it. A sub-folder of folder[j] must start with folder[j], followed by a "/". For example, "/a/b" is a sub-folder of "/a", but "/b" is not a sub-folder of "/a/b/c".
//
//The format of a path is one or more concatenated strings of the form: '/' followed by one or more lowercase English letters.
//
//For example, "/leetcode" and "/leetcode/problems" are valid paths while an empty string and "/" are not.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveSubFoldersFromTheFilesystem {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder, Comparator.comparing(s -> s.length()));
        Set<String> seen = new HashSet<>();
        outer:
        for (String f : folder) {
            for (int i = 2; i < f.length(); i++) {
                if (f.charAt(i) == '/' && seen.contains(f.substring(0, i)))
                    continue outer;
            }
            seen.add(f);
        }
        return new ArrayList<>(seen);
    }
}
