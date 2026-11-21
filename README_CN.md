# 喜报 飞跃版

[[English]](https://github.com/Yuang114514/Xibao-Fly/blob/Fabric/README.md)[简体中文]

把 [Xibao++](https://github.com/GregTaoo/Xibao-Plus-Plus) 移植到了 Fabric 26.1 / 26.2。

## 特性

### 继承自 喜报++
- 在你从服务器断链时显示一个“喜报”或“悲报”页面
- 3首喜庆音乐和1首悲伤音乐
- 撒花

### 扩展功能

- 使用 `DisconnectedScreen` 的重写而非Mixin来更加友好地兼容其它模组
- 重构的撒花运动轨迹

## 安装

### 从Actions下载

每次推送的构建可以在 [Actions 页面](https://github.com/Yuang114514/Xibao-Fly/actions) 下载。

### 从源码构建

1. Clone 本仓库或下载 zip 压缩包到本地。
2. 在仓库根目录运行：
```bash
./gradlew build
```
> Windows 用户请使用 `./gradlew.bat`。
3. 构建完成后，按游戏版本选择 jar：
   - Minecraft 26.1.x：`26.1/build/libs/xibao-fly-26.1-<version>.jar`
   - Minecraft 26.2：`26.2/build/libs/xibao-fly-26.2-<version>.jar`
4. 把选中的 jar 放进对应 Minecraft 实例的 `mods` 文件夹。
5. 启动游戏。

### 从 Modrinth 下载

_即将到来_

~~这似冯modrinth审核能不能快点~~