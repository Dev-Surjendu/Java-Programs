static int[] isPrime(int pr[]) {
    int count = 0, a = 0;
    int prime[] = new int[pr.length];

    for (int i = 1; i < pr.length; i++) {
        for (int j = 1; j <= i; j++) {
            if (pr[i - 1] % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            prime[a++] = i;
        }
        count = 0;
    }
    return Arrays.copyOfRange(prime, 0, a);
}