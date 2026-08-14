#!/usr/bin/env bash
set -e
mvn -Plinux clean javafx:jlink
echo "Runtime image will be in target/jlink/TemperatureConverterFX"
