package com.destiny.deconapp.Model;

import java.util.ArrayList;

public class MemberData {
    public static String[][] data = new String[][]{
            {"https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/p960x960/74574090_540566673173690_5694687186327175168_o.jpg?_nc_cat=103&_nc_oc=AQlxB81rHq6bIDPrghsrJfvUUuhM0MTmtoCXaTf-dmiZ0XxYquBKMiFjhtAuWIgIpGs&_nc_ht=scontent-sin2-1.xx&oh=c683c1deb8ebec87c524a55bec88b355&oe=5E8C478D",
                    "Muhammad Supriyadi",
                    "Android Developer",
                    "CVSupriyadi.pdf"
            },
            {"https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/s960x960/75341011_540565023173855_231761318669975552_o.jpg?_nc_cat=102&_nc_oc=AQkE0q_BIJL-SPTIbjQrbCa_dD6Dy_8OtcDIexjwa3CN1Cum5xkSGKJyjnzBboRS__Q&_nc_ht=scontent-sin2-1.xx&oh=685858dc1452c1d38f1912a3cea295fb&oe=5E50B9EC",
                    "Muhammad Ibrahim Yahya",
                    "System and Business Analyst",
                    "CVBaim.pdf"
            },
            {"https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/76765468_540564993173858_4513279092086276096_n.jpg?_nc_cat=107&_nc_oc=AQln0-sG1lbaeQ8MmnZohdhIwG-yTAClOpqgCX-zNWhQRgYm-o9G-zkwmuDWx7ovb1g&_nc_ht=scontent-sin2-1.xx&oh=41ff36b6eff62ce335cf2191b578aabc&oe=5E88D9A1",
                    "Fajar Ramadhan Putra Santoso",
                    "Web Developer",
                    "CVFajar.pdf"
            },
            {"https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/s960x960/74614851_540564983173859_882206271376195584_o.jpg?_nc_cat=111&_nc_oc=AQnW2L_yoLmfCC2UTYavgMPXQhc3YAGLESJSv66XT2JtqIJvZyXho42WyzDn9lZz0qE&_nc_ht=scontent-sin2-1.xx&oh=d500e95d40837767153dd0e26c7df4e5&oe=5E58DEB2",
                    "Ade Afriansyah",
                    "UI And UX Designer",
                    "CVAde.pdf"
            }
    };
    public static ArrayList<Model> getListData(){
        Model memberModel = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            memberModel = new Model();
            memberModel.setGambar(aData[0]);
            memberModel.setNama(aData[1]);
            memberModel.setSpesialis(aData[2]);
            memberModel.setCvPDF(aData[3]);
            list.add(memberModel);
        }

        return list;
    }
}
