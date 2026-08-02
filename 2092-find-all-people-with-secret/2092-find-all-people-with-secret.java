class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        // 1. Sort meetings by time
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        // 2. Set of people who know the secret
        Set<Integer> known = new HashSet<>();
        known.add(0);
        known.add(firstPerson);

        int i = 0;
        while (i < meetings.length) {

            int time = meetings[i][2];

            // 3. Store meetings of the same time
            Map<Integer, List<Integer>> graph = new HashMap<>();
            Set<Integer> peopleAtTime = new HashSet<>();

            while (i < meetings.length && meetings[i][2] == time) {
                int x = meetings[i][0];
                int y = meetings[i][1];

                graph.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
                graph.computeIfAbsent(y, k -> new ArrayList<>()).add(x);

                peopleAtTime.add(x);
                peopleAtTime.add(y);
                i++;
            }

            // 4. BFS from people who already know the secret
            Queue<Integer> q = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            for (int p : peopleAtTime) {
                if (known.contains(p)) {
                    q.offer(p);
                    visited.add(p);
                }
            }

            while (!q.isEmpty()) {
                int curr = q.poll();
                known.add(curr);

                for (int next : graph.getOrDefault(curr, new ArrayList<>())) {
                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
        }

        // 5. Convert result to list
        return new ArrayList<>(known);
    }
}

