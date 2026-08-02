class Solution {
    public int maximumEnergy(int[] energy, int k) {
        for (int i = energy.length-1-k; i >= 0;i--)
            energy[i] = energy[i+k]+energy[i];
        int max =  energy[0];
        for (int i : energy)
            max = Math.max(max,i);
        return max;
    }
}