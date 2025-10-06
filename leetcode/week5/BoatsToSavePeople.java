public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum > limit) {
                answer++;
                right--;
                continue;
            }
            left++;
            right--;
            answer++;
        }

        return answer;
    }

}
