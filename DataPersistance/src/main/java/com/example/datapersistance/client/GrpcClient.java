package com.example.datapersistance.client;

import com.example.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

        ProductGrpc.ProductBlockingStub stub = ProductGrpc.newBlockingStub(channel);

        SaveResponse response = stub.save(SaveRequest.newBuilder().setRegistrationNo(20).setPartNo(2).setTrayId(1).build());
       // SaveRequest request = SaveRequest.newBuilder().setRegistrationNo(20).setPartNo(2).setTrayId(1).build();
        //SaveResponse response = stub.save(request);

        System.out.println(response.getPartNo());
        channel.shutdown();
    }
}
