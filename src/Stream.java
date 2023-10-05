import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    
    private List<StudentGroup> studentGroups;
    
    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
    
    public int getNumberOfGroups() {
        return studentGroups.size();
    }
}

