#!/bin/bash

rsync -avz --delete --exclude-from rsync.excludes . deeper:tmp/TestProject/HelloAntlr/
