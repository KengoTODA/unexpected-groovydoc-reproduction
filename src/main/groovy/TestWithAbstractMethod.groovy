enum TestWithAbstractMethod {
    FOO {
        int method() { return 0; }
    },
    BAR {
        int method() { return 1; }
    }
    abstract int method();
}
