package com.example.myapplication.modules;

import android.content.Context;

import com.example.myapplication.MainActivity;


/**
 * Created by Hong Thai
 */
//public class GetAddressTask extends AsyncTask<String, Void, String> {
    public class GetAddressTask{
    private MainActivity activity;
    Context ctx;

  /*  public GetAddressTask(Context ctx) {
        super();
        this.activity = activity;
        this.ctx = ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        Geocoder geocoder;
        List<Address> addresses;
        geocoder = new Geocoder(ctx, Locale.getDefault());

        try {
            addresses = geocoder.getFromLocation(Double.parseDouble(params[0]), Double.parseDouble(params[1]), 1);

            //get current Street name
            String address = addresses.get(0).getAddressLine(0);

            //get current province/City
            String province = addresses.get(0).getAdminArea();

            //get country
            String country = addresses.get(0).getCountryName();

            //get postal code
            String postalCode = addresses.get(0).getPostalCode();

            //get place Name
            String knownName = addresses.get(0).getFeatureName(); // Only if available else return NULL

            return address + ", " + province + ", " + country
                    ;

        } catch (IOException ex) {
            ex.printStackTrace();
            return "IOE EXCEPTION";

        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            return "IllegalArgument Exception";
        }

    }



    @Override
    protected void onPostExecute(String address) {
        // Call back Data and Display the current address in the UI
        activity.callBackDataFromAsyncTask(address);
    }*/
}
