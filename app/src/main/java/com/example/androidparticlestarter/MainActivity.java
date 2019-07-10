package com.example.androidparticlestarter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.particle.android.sdk.cloud.ParticleCloud;
import io.particle.android.sdk.cloud.ParticleCloudSDK;
import io.particle.android.sdk.cloud.ParticleDevice;
import io.particle.android.sdk.cloud.ParticleEvent;
import io.particle.android.sdk.cloud.ParticleEventHandler;
import io.particle.android.sdk.cloud.exceptions.ParticleCloudException;
import io.particle.android.sdk.utils.Async;

public class MainActivity extends AppCompatActivity {
    // MARK: Debug info
    private final String TAG="Jatin";

    // MARK: Particle Account Info
    private final String PARTICLE_USERNAME = "jatin_verma@outlook.com";
    private final String PARTICLE_PASSWORD = "kaur1234";

    //piano buttons
    Button b1, b2, b3, b4 , b5, b6, b7, b8, b9, b10, b11,b12,b13;

    // MARK: Particle device-specific info
    private final String DEVICE_ID = "38002a000247363333343435";

    // MARK: Particle Publish / Subscribe variables
    private long subscriptionId;

    // MARK: Particle device
    private ParticleDevice mDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        // 1. Initialize your connection to the Particle API
        ParticleCloudSDK.init(this.getApplicationContext());

        // 2. Setup your device variable
        getDeviceFromCloud();

    }






    public void button1(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "C";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
    }

    public void button2(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "CD";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button3(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "D";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}
    public void button4(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "DE";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button5(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "E";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button6(View view) {
        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "F";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });

}

    public void button7(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "FG";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button8(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "G";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button9(View view) {
        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "GA";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });

}

    public void button10(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "A";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button11(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "AB";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button12(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "B";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}

    public void button13(View view) {

        Log.d(TAG, "BUTTON PRESSED!");

        // 1. check if device has a value
        // - if device is null, then quit!
        if (this.mDevice == null) {
            Log.d(TAG, "ERROR: No device found.");
            return;
        }

        String controlOfPiano = "C";

        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {
            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                // put your logic here to talk to the particle
                // --------------------------------------------

                // what functions are "public" on the particle?
                Log.d(TAG, "Availble functions: " + mDevice.getFunctions());

                // call the "lights" function on the particle

                List<String> functionParameters = new ArrayList<String>();
                functionParameters.add(controlOfPiano);
                try {
                    mDevice.callFunction("chord", functionParameters);
                } catch (ParticleDevice.FunctionDoesNotExistException e1) {
                    e1.printStackTrace();
                }


                return -1;
            }

            @Override
            public void onSuccess(Object o) {
                // put your success message here
                Log.d(TAG, "Success!");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                // put your error handling code here
                Log.d(TAG, exception.getBestMessage());
            }
        });
}







    /**
                 * Custom function to connect to the Particle Cloud and get the device
                 */
                public void getDeviceFromCloud() {
                    // This function runs in the background
                    // It tries to connect to the Particle Cloud and get your device
                    Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                        @Override
                        public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {
                            particleCloud.logIn(PARTICLE_USERNAME, PARTICLE_PASSWORD);
                            mDevice = particleCloud.getDevice(DEVICE_ID);
                            return -1;
                        }
            @Override
            public void onSuccess(Object o) {
                Log.d(TAG, "Sent command to device.");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                Log.d(TAG, exception.getBestMessage());
            }
        });
    }




}
