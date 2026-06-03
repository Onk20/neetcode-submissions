class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] result = new int[temperatures.length];

        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek()[0]){

                int[] pair = stack.pop();
                int resultIndex = pair[1];
                result[resultIndex] = i - resultIndex;
            }

            stack.push(new int[]{t, i});
        }

        return result;
    }
}
