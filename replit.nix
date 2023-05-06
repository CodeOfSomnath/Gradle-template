{ pkgs }: {
    deps = [
        pkgs.graalvm17-ce
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}