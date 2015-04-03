public String convertToTitle(int n) {
        char[] a = {'A','B','C','D','E','F','G','H','I','J',
                    'K','L','M','N','O','P','Q','R','S',
                    'T','U','V','W','X','Y','Z' };
        StringBuilder S = new StringBuilder();
        int temp =0;
        while(n!=0){
            temp = n%26;
            n = n/26 ;
            if(temp==0){//when n = 26/52/...
                temp = 26;
                n=n-1; // since its 26's multiple, n-1
            }
           
            S.append(a[temp-1]);
        }
           
        return S.reverse().toString();
    }