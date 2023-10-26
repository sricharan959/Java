class Bisect {
    public static void main(String[] args) {
        int n=19;
        int low=1, high=n, mid;
        while (low<=high){
            mid=(low+high)/2;
            if (mid*mid <= n) low=mid+1;
            else high=mid-1;
        }
        System.out.println("Square root of " + n +": "+ high);

    }
}
