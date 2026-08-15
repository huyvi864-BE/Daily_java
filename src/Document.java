public class Document {
    private String documentId;
    private String title;
    private boolean isApproved;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String newId) {
        if (newId != null && !newId.isEmpty()) {
            documentId = newId;
        } else {
            System.out.println("Error: Document ID cannot be empty!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approvedStatus) {
        this.isApproved = approvedStatus;
    }

    public void printInfo() {
        System.out.println("--- Document Information ---");
        System.out.println("ID: " + documentId);
        System.out.println("Title: " + title);
        System.out.println("Status: " + (isApproved ? "Approved" : "Pending"));
    }
}

