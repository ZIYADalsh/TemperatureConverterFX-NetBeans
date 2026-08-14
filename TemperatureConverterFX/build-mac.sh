#!/usr/bin/env bash
set -e
mvn -Pmac clean javafx:jlink
echo "Runtime image will be in target/jlink/TemperatureConverterFX"
