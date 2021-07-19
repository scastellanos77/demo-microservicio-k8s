#!/bin/bash

cd comprafront
mvn clean install
if docker build -t scastell77/oficomprafront:1.0 . ; then
  docker push scastell77/oficomprafront:1.0
fi
cd ..

cd catalogoproducto
mvn clean install
if docker build -t scastell77/oficatalogoproducto:1.0 . ; then
  docker push scastell77/oficatalogoproducto:1.0
fi
cd ..

cd gestionstock
mvn clean install
if docker build -t scastell77/ofigestionstock:1.0 . ; then
  docker push scastell77/ofigestionstock:1.0
fi
cd ..
