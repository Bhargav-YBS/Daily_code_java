public class ImplementStackUsingQueues225 {
    
    public class MyStack {
        private Queue<Integer> q1 = new LinkedList<>();
        private Queue<Integer> q2 = new LinkedList<>();
        private int top = 0;
        public MyStack() {
            
        }
        public void push(int x) {
            if (empty()) {
                q1.add(x);
            } else {
                if (q1.isEmpty()) {
                    q2.add(x);
                } else {
                    q1.add(x);
                }
            }
            top = x;
        }
        public int pop() {
            if (q1.isEmpty()) {
                int len = q2.size();
                for (int i=1; i<len; i++) {
                    top = q2.poll();
                    q1.add(top);
                }
                return q2.poll();
            } else {
                int len = q1.size();
                for (int i=1; i<len; i++) {
                    top = q1.poll();
                    q2.add(top);
                }
                return q1.poll();
            }
        }
        public int top() {
            return top;
        }
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }

    }

    public class MyStack2 {
        private Queue<Integer> q = new LinkedList<>();
        public MyStack() {
            
        }
        public void push(int x) {
            q.add(x);
            int s = q.size();
            while (s > 1) {
                q.add(q.remove());
                s--;
            }
        }
        public int pop() {
            return q.remove();
        }
        public int top() {
            return q.peek();
        }
        public boolean empty() {
            return q.isEmpty();
        }
    }

}
