class Solution {
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = {0,0};
        int res = students.length;
        for (int student : students)
            count[student]++;
        for (int sandwich : sandwiches){
            if (count[sandwich]==0)
                return res;
            count[sandwich]--;
            res--;
        }
        return res;
    }
}