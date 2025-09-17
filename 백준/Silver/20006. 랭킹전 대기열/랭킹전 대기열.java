import java.io.*;
import java.util.*;

public class Main {
    static class Player {
        int level;
        String name;

        Player(int level, String name) {
            this.level = level;
            this.name = name;
        }
    }

    static class Room {
        int minLevel, maxLevel;
        List<Player> players = new ArrayList<>();
        int capacity;

        Room(int level, int capacity) {
            this.minLevel = level - 10;
            this.maxLevel = level + 10;
            this.capacity = capacity;
        }

        boolean canEnter(int level) {
            return players.size() < capacity && level >= minLevel && level <= maxLevel;
        }

        boolean isFull() {
            return players.size() == capacity;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Room> rooms = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            boolean entered = false;
            for (Room room : rooms) {
                if (room.canEnter(level)) {
                    room.players.add(new Player(level, name));
                    entered = true;
                    break;
                }
            }

            if (!entered) {
                Room newRoom = new Room(level, m);
                newRoom.players.add(new Player(level, name));
                rooms.add(newRoom);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (Room room : rooms) {
            if (room.isFull()) {
                answer.append("Started!\n");
            } else {
                answer.append("Waiting!\n");
            }

            room.players.sort(Comparator.comparing(p1 -> p1.name));
            for (Player player : room.players) {
                answer.append(player.level).append(" ").append(player.name).append("\n");
            }
        }

        System.out.print(answer);
    }
}