# Simple Head

A simple and lightweight Minecraft plugin that allows players to get player heads by using a command.

## Features

- Get a player head by username
- Simple `/head` command
- Permission-based command access
- Configurable messages
- Lightweight and easy to use
- Supports English and German messages

## Command

```txt
/head <player>
```

Example:

```txt
/head Notch
```

This gives the player head of the specified username.

> Note: The plugin can only give heads of players who have already joined the server.

## Permission

```txt
head.use
```

Players need this permission to use the `/head` command.

## Installation

1. Download or build the plugin `.jar`
2. Put the `.jar` file into your server's `plugins` folder
3. Restart or start your server
4. Configure the messages if needed
5. Give players the required permission:

```txt
head.use
```

## Configuration

You can change the plugin messages in the config file.

After the first server start, the plugin should create its configuration files automatically.

Example messages you may want to customize:

- No permission message
- Player not found message
- Successful head received message
- Command usage message

## Requirements

- Java
- Spigot or Paper server
- Minecraft 1.20 or newer recommended

Tested versions according to the Spigot page:

- 1.20
- 1.20.6
- 1.21

## Build

Clone the repository:

```bash
git clone https://github.com/FilipPikus/Simple-Head.git
cd Simple-Head
```

Build with Maven:

```bash
mvn clean package
```

The compiled plugin `.jar` will be located in the `target` folder.

## Educational Purpose

This project is also useful for learning basic Minecraft plugin development, including:

- Creating commands
- Working with permissions
- Using configuration files
- Giving custom items to players
- Building Java projects with Maven

## License

This project is licensed under the Apache License 2.0.


GitHub About:

Lightweight Minecraft Spigot/Paper plugin for getting player heads by username with configurable messages and permissions.
