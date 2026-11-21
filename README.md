# Xibao Fly

[English][[简体中文]](https://github.com/Yuang114514/Xibao-Fly/blob/Fabric/README_CN.md)

26.1 and 26.2 ports of [Xibao++](https://github.com/GregTaoo/Xibao-Plus-Plus).

## Features

### From Xibao++
- Show a "Xibao" (Chinese which means _happy message_) or "Beibao" (Chinese _bad message_) screen when you disconnected from server.
- 3 happy musics & 1 sad music.
- "Sahua" —— Chinese tradition, blow some ribbons when there are some big celebration.

### Extended Features

- Rebuilt code structure, `DisconnectedScreen` extension instead of mixin.
- Rebuilt _Sahua_ particle movement.

## Installation

### Download from Actions

Build per push available at [Actions Page](https://github.com/Yuang114514/Xibao-Fly/actions)

### Build from source

1. Clone this repo or download the zip archive to your PC.
2. At the root folder, run:
```bash
./gradlew build
```
> Windows users should use `./gradlew.bat` instead.
3. When the build task finished, pick the jar for your game version:
   - Minecraft 26.1.x: `26.1/build/libs/xibao-fly-26.1-<version>.jar`
   - Minecraft 26.2: `26.2/build/libs/xibao-fly-26.2-<version>.jar`
4. Copy that one jar to your modded Minecraft instance's `mods` folder.
5. Start Minecraft and enjoy it!

### Download from Modrinth

_coming soon_

~~How dare do these fucking moderators think it is AI generated~~