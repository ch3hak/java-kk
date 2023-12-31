public class Solution{
    public class Solution extends GuessGame {
        public int guessNumber(int n) {

            int low = 1, high = n;

            while(low <= high){
                int mid = low+(high-low)/2;
                int get = guess(mid);

                if(guess(mid) == 0) return mid;
                else if(get < 0) high = mid-1;
                else low = mid+1;

            }

            return 0;
        }
    }
}
