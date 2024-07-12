package task;

public class Player {
    private int id;
    private String name;
    private int score;

    // Constructor
    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Player{id=" + id + ", name='" + name + "', score=" + score + "}";
    }
}
