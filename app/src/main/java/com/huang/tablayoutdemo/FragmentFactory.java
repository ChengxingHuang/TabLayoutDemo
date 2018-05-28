package com.huang.tablayoutdemo;

/**
 * Created by huang on 2018/5/28.
 */

public class FragmentFactory {
    private static BaseFragment[] mBaseFragments = new BaseFragment[8];

    public static BaseFragment createFragment(int position){
        BaseFragment baseFragment = mBaseFragments[position];
        if (baseFragment == null) {
            switch (position) {
                case 0:
                    baseFragment = new CarFragment();
                    break;
                case 1:
                    baseFragment = new FinanceFragment();
                    break;
                case 2:
                    baseFragment = new GameFragment();
                    break;
                case 3:
                    baseFragment = new MilitaryFragment();
                    break;
                case 4:
                    baseFragment = new MovieFragment();
                    break;
                case 5:
                    baseFragment = new MusicFragment();
                    break;
                case 6:
                    baseFragment = new SportFragment();
                    break;
                case 7:
                    baseFragment = new TravelFragment();
                    break;
            }

            mBaseFragments[position] = baseFragment;
        }

        return baseFragment;
    }
}
