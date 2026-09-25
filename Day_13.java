public class ImplementQueueUsingStacks232 {

    class MyQueue {
        private Stack<Integer> st;
        public MyQueue() {
            this.st = new Stack<Integer>();
        }
        public void push(int x) {
            Stack<Integer> temp = new Stack<>();
            int preSize = this.st.size();
            for (int i=0; i<preSize; i++) {
                temp.push(this.st.pop());
            }
            this.st.push(x);
            for (int i=0; i<preSize; i++) {
                this.st.push(temp.pop());
            }
        }
        public int pop() {
            return this.st.pop();
        }
        public int peek() {
            return this.st.peek();
        }
        public boolean empty() {
            return this.st.isEmpty();
        }
    }

}



/**
* Your MyQueue object will be instantiated and called as such:
* MyQueue obj = new MyQueue();
* obj.push(x);
* int param_2 = obj.pop();
* int param_3 = obj.peek();
* boolean param_4 = obj.empty();
*/
