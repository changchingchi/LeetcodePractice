//Find pair with given sum in the array
    @Test
    public void finsumm() throws Exception {
        int sum = 10;
        int[] a = {8,1,2,5,7,9};
        findSum(a,sum);

    }

    private void findSum(int[] array, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<array.length; i++){
            if(map.containsKey(sum-array[i])){
                System.out.println("found pair at index "+i+" and "+map.get(sum-array[i]));
            }
            map.put(array[i],i);// value and index
            //8,1,2
        }
    }
