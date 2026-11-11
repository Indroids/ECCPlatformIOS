// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "ECCPlatformIOS",
    platforms: [.iOS(.v16)],
    products: [
        .library(name: "ECCPlatform", targets: ["ECCPlatform"])
    ],
    targets: [
        .binaryTarget(
            name: "ECCPlatform",
            url: "https://github.com/Indroids/ECCPlatformIOS/releases/download/v1.0.1/ComposeApp.xcframework.zip",
            checksum: "5a013a7f3454b77c79bae7272f297b8e1291bdeec43f4239c564b962f4d6ed8a"
        )
    ]
)
