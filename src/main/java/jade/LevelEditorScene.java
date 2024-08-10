package jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene
{
    public boolean changingScene =false;
    private float timeToChangeScene = 2.0f;
    public LevelEditorScene(){
        System.out.println("Inside level editor scene ");
    }

    @Override
    public void update (float dt){
        if(!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)){
            changingScene = true;
            Window.get().r-=dt*5.0f;
            Window.get().g-= dt*5.0f;
            Window.get().b-= dt*5.0f;

        }

        if(changingScene && timeToChangeScene>0){
            timeToChangeScene -=dt;
        }else if(changingScene){
            Window.changeScene(1);
        }

    }
}
