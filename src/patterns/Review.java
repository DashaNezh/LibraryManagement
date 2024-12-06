package patterns;

import java.util.ArrayList;
import java.util.List;

public class Review implements RatingComponent {
    private String comment;
    private List<RatingComponent> components = new ArrayList<>();

    public Review(String comment) {
        this.comment = comment;
    }

    public void add(RatingComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Review: " + comment);
        for (RatingComponent component : components) {
            component.display();
        }
    }
}
