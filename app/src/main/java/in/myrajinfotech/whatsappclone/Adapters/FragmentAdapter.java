package in.myrajinfotech.whatsappclone.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import in.myrajinfotech.whatsappclone.Fragments.Calls;
import in.myrajinfotech.whatsappclone.Fragments.Camera;
import in.myrajinfotech.whatsappclone.Fragments.Chats;
import in.myrajinfotech.whatsappclone.Fragments.Status;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Camera();
            case 1:
                return new Chats();
            case 2:
                return new Status();
            case 3:
                return new Calls();
            default:
                return new Chats();
        }
    }
        @Override
        public int getItemCount() {
            return 4;
        }
}
