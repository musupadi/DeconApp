package com.destiny.deconapp.Model;

import java.util.ArrayList;

public class PortofolioData {
    public static String[][] data = new String[][]{
            {"Biodata Pahlawan",
                    "Android",
                    "Aplikasi ini adalah Aplikasi pendataan Biodata Pahlawan, Bukan hanya biodata singkat saja namun juga kita dapat melihat dimana pahlawan tersebut dimakamkan Aplikasi ini memiliki Fitur Login untuk dapat mengikuti Kuis yang ada di dalam Aplikasi dan dapat melihat High Score yang pernah menggunakan Aplikasi sehingga pengguna dapat belajar tentang Pahlawan Indonesia \n" +
                            "Fitur Aplikasi :\n" +
                            "1.Aplikasi ini didukung dengan 2 Database yaitu MySQL dan Sqlite\n" +
                            "2.Seluruh Aplikasi ini terhubung dengan menggunakan API yang disimpan di dalam server Cloud\n" +
                            "3.Aplikasi ini didukung dengan menggunakan Google Maps Library sederhana dimana disimpan data Latitude dan Longitude untuk ditampilkan oleh User\n" +
                            "Status Aplikasi : ProsesUpload Playstore (Playstore membutuhkan beberapa hari untuk mengecheck konten aplikasi)\n",
                    "https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/s960x960/74645264_540584803171877_4075335514729742336_o.jpg?_nc_cat=105&_nc_oc=AQmPWP7NxXdEf_6xVtZ68dPNmzkpssaU2L_ck04zACgCIykVovz9iTXN59H7ddwFiFw&_nc_ht=scontent-sin2-1.xx&oh=d39d86a0df71bfb5b2d9b4dcd9a75aa9&oe=5E4B1EC5",
                    "Navigator Drawer",
                    "https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/s960x960/75462272_540584916505199_3856097526125953024_o.jpg?_nc_cat=101&_nc_oc=AQnHxxBxHNVFy_Nv0c_JSjNJlUV0fF2O9oGVlexFL2HQoorIpul6Szs2GHnUsNs6Fig&_nc_ht=scontent-sin2-1.xx&oh=6b7e451aa8cb4dc2b4d5084e0dbc3c12&oe=5E524C5B",
                    "Dashboard Main",
                    "https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/s960x960/75580327_540585313171826_7157752303762538496_o.jpg?_nc_cat=111&_nc_oc=AQlu0gV1jDXPRpXOZdg6RVy6zBS4pyUMnAUp4IOZwu5XYVra2vHY5QcoAAc-Tcc-IzI&_nc_ht=scontent-sin2-1.xx&oh=cf91325217747a3a8b242e3736658345&oe=5E55A9EA",
                    "Makam Pahlawan",
                    "Testing",
                    "-"
            },
            {"Katalog Mutiara Tiga Berlian",
                    "Android",
                    "Aplikasi ini adalah Aplikasi catalog untuk PT Mutiara Tiga Berlian, Aplikasi ini adalah Aplikasi Versi Android dimana berisi tentang Katalog Produk,Blog dan Contact Perusahaan sehingga User dapat melihat tentang Profile Perusahaan dengan mudah\n" +
                            "Fitur Aplikasi :\t\n" +
                            "1.Aplikasi ini didukung dengan 2 Database yaitu MySQL dan Sqlite\n" +
                            "2.Seluruh Aplikasi ini terhubung dengan menggunakan API yang disimpan di dalam server Cloud\n" +
                            "3.Aplikasi ini didukung dengan menggunakan Google Maps Library sederhana dimana data Lat dan Long hanya berbentuk Statis dan tidak berubah\n" +
                            "4.Aplikasi ini adalah Aplikasi Web dan Android dimana Databasenya terbagi sehingga ketika Web update maka Androidpun akan ikut Update\n" +
                            "5.Aplikasi ini menggunakan Library Glide dimana data gambar disimpan di dalam cache sehingga aplikasi terasa sangat enteng dan tidak terlalu banyak menggunakan Kuota\n",
                    "https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/72771559_540897906473900_2447025829843042304_n.jpg?_nc_cat=100&_nc_oc=AQkz4tBHIFPJ3iCpELVmtAA6VTx3_DHHVjUEnAWulgez4sFT-XIZ6vbgLrQ73wbmfGs&_nc_ht=scontent-sin2-1.xx&oh=6fcb89db4deeea6bc8dd03daea858127&oe=5E43FF7A",
                    "Menu Utama",
                    "https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/76246698_540897946473896_2394189876607057920_n.jpg?_nc_cat=102&_nc_oc=AQkli2AF3eP9dASH3aO0DoUl-UhkqR_8P-Gz34wDpJdBIy7h6r6LnSer809Gt3CwA18&_nc_ht=scontent-sin2-1.xx&oh=0c345411603fa1969cd22a69d0f91072&oe=5E57CE9C",
                    "Menu Product",
                    "https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/75310407_540897976473893_5655614331237171200_n.jpg?_nc_cat=100&_nc_oc=AQmQBeisye0pZXFNLyvFsc6h_u842N5tAvwgCvV9uAg2kgzM_uzvM8JEan_5eq4lfME&_nc_ht=scontent-sin2-1.xx&oh=07135525c58877de8af85ac1b0a84fa7&oe=5E4611B3",
                    "Menu Contact",
                    "Published",
                    "com.destiny.mutiaratigaberlian"
            }

    };
    public static ArrayList<Model> getListData(){
        Model memberModel = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            memberModel = new Model();
            memberModel.setAppsname(aData[0]);
            memberModel.setPlatform(aData[1]);
            memberModel.setFeature(aData[2]);
            memberModel.setImgapps1(aData[3]);
            memberModel.setAboutimage1(aData[4]);
            memberModel.setImgapps2(aData[5]);
            memberModel.setAboutimage2(aData[6]);
            memberModel.setImgapps3(aData[7]);
            memberModel.setAboutimage3(aData[8]);
            memberModel.setStatus(aData[9]);
            memberModel.setLink(aData[10]);
            list.add(memberModel);
        }

        return list;
    }
}
