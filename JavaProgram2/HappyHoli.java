public class HappyHoli {
    public static void main(String[] args) {
        String[] colors = {"\033[0;31m", "\033[0;32m", "\033[0;33m", "\033[0;34m", "\033[0;35m", "\033[0;36m"};
        String message = "Happy Holi!";
        int len = message.length();
        int radius = 10;
        int centerX = 20;
        int centerY = 10;

        for (int i = 0; i < len; i++) {
            double angle = i * Math.PI * 2 / len;
            int x = (int) (centerX + radius * Math.cos(angle));
            int y = (int) (centerY + radius * Math.sin(angle));
            String color = colors[i % colors.length];
            System.out.print("\033[" + y + ";" + x + "H" + color + message.charAt(i));
        }
        System.out.print("\033[" + (centerY + radius + 2) + ";" + centerX + "H\033[0m");
    }
}