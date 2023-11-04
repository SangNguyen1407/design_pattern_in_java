public class Main {
    public static void main(String[] args) throws Exception {
        DocumentsContext context = new DocumentsContext();

        context.setState(new NewState());
        context.applyState();

        context.setState(new SubmittedState());
        context.applyState();

        context.setState(new ApprovedState());
        context.applyState();
    }
}
