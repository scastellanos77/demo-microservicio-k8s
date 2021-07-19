#!/bin/bash

cd comprafront
mvn clean install
cd ..
cd catalogoproducto
mvn clean install
cd ..
cd gestionstock
mvn clean install
cd ..

