#!/usr/bin/env bash

#!/usr/bin/env bash

protoDir="./protos"
outDir="./"
protoc -I ${protoDir}/ ${protoDir}/*proto --go_out=plugins=grpc:${outDir}