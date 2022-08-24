package functional;

@FunctionalInterface
interface Visible {
    void show();
}

@FunctionalInterface
interface Addition{
    int add(int x, int y);
}