# ZoomControls

## Introduction

Zoom controls class is a basic set of controls that is used for zooming in and out and offers callback methods for events (such as onclickevents) to take place. The Zoom controls has two basic buttons designed for its only designated purpose; "ZoomIn" and "ZoomOut", which accordingly, are used to control the component of the zooming mechanism. 

![Picture](/Images/zoomicon.png)

As you can see, it is a very basic component.

## History
The ZoomControls is a class that is extendable from the LinearLayout Class.
The functionality of the ZoomControls was added in the first API level of android studio, but was later removed in API level 29.
The reason being for its removal was because its purpose was better managed by custom made layouts instead of having a commmited view for it.

## Major Methods/Attributes

![Picture2](/Images/zoomcontrolattribute.png)

Going to the drawable xml file, you can add zoomcontrols view by using ```<ZoomControls />``` along with another basic android view attribute manipulation. 

The ZoomControls has many methods such as ```SetIsZoomInEnabled()```/ ```SetIsZoomOutEnabled()``` and also ```setOnZoomInClickListener()``` and ```setOnZoomOutClickListener()```
However, the more important methods that the ZoomControls class has is the ```show()``` and ```hide()``` functions which allow us to hide the ZoomControls button. Like the one shown in the following example:

![Gif](/Images/show-hide-in-ZoomControls-Android.gif)

## Examples / Code
Heres some sample code that will hide and show the ZoomControl
```
  button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //demo the use of show() method
        zoomcontrol.show();
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //showing the demo of hide() method
            zoomcontrol.hide();
        }
    });
```
You also do not need to setup a onClickListener for the Zoomcontrol as it already has the method setOnZoomInClickListener(); and setOnZoomOutClickListener(); .Therefore, the code would look something like this which has been tweaked from ZoomControls tutorial online blog to fit for my circumstances:

```
zoomcontrol.setOnZoomInClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //getting the image's X and Y on the screen
            float x = star.getScaleX();
            float y = star.getScaleY();
            // zoom in on picture
            star.setScaleX((float) (x + 2));
            star.setScaleY((float) (y + 2));
        }
    });

        //showing off the set on zoom click portion on the picture
        zoomcontrol.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting the image's X and Y on the screen
                float x = star.getScaleX();
                float y = star.getScaleY();
                // zoom out on picture
                star.setScaleX((float) (x - 2));
                star.setScaleY((float) (y - 2));
            }
        });
```
All it's doing is zooming in/out on a imageview called "star" which was first located by its X and Y properties, and then scaling those said properties by any increment/decrement, in this case 2. The code is uploaded, but heres a demonstration of that anyways:

![code demo](/Images/zoomcontroltest.gif)

## References 

Cptech. (2018, December 12). Zoom Controls Tutorial With Example In Android Studio: Android Solution: Zoom Control. Retrieved December 10, 2019, from http://androidssources.blogspot.com/2018/12/zoom-controls-tutorial-with-example-in.html.

Hussain, Z., AbdulRehman, Bhushan, Luna, K. F. A. D., Zamil, UI, A., … Akshay. (n.d.). Zoom Controls Tutorial With Example In Android Studio. Retrieved December 10, 2019, from https://abhiandroid.com/ui/zoomcontrols.



