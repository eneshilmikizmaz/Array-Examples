public class AverageOfElements {
    public double harmonicAvr(int[] arr){
        double harmonicSum = 0;
        for(int i = 1; i<arr.length;i++){
            harmonicSum+=  (1/i);
        }
        return  arr.length/harmonicSum;
    }
}
