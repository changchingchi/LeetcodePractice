public int reverseInt(int n){
	//this is pure math quesitons...
	// 123-->321
	// -123 --> -321
	int result = 0;
	while(n!=0){
		result = result*10+n%10;
		n = n/10;
	}
	return result;

}