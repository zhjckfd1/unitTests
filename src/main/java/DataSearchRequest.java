import java.time.LocalDate;

public class DataSearchRequest {
    String id;
    LocalDate updatedBefore;
    int length;

    public DataSearchRequest(String id, LocalDate updatedBefore, int length) {
        this.id = id;
        this.updatedBefore = updatedBefore;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public LocalDate getUpdatedBefore() {
        return updatedBefore;
    }

    public int getLength() {
        return length;
    }
}
