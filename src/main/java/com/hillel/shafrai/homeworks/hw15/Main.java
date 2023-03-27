package com.hillel.shafrai.homeworks.hw15;

public class Main {
    public static void main(String[] args){
        MusicStyles[] musicStyles = {
                new ClassicMusic(),
                new PopMusic(),
                new RockMusic()
        };
        for(MusicStyles musicStyle : musicStyles){
            musicStyle.playMusic();
        }
    }
}
