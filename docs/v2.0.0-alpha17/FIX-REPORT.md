# v2.0.0-alpha17 implementation report

## Splitter Undo
Alpha16 stored its Undo state when a slider touch began. A tap or otherwise non-changing gesture could therefore replace a previously useful Undo point. Alpha17 separates gesture start from gesture commit: the starting range is staged, and it becomes the Undo snapshot only when the gesture finishes with a different start/end value. Normal release and cancelled genuine horizontal drags use the same completion path.

## Divider/settings
The default divider selection is now 90 seconds. Splitter settings display a label and concise explanation for each numeric field.

## App usage report
A manual aggregate report is available in Diagnostics. It is generated locally and previewed before the user chooses Email or Copy. It excludes media URLs, filenames/paths, cookies, diagnostic log text, activation PINs, administrator passwords and signing material. No analytics endpoint or automatic telemetry was added.

## Critical crash report
CrashGuardApplication stores uncaught Java crash information locally. Alpha17 prompts on the next stable app launch, when the user can send, keep or discard it. This avoids attempting network/UI work inside an unstable crashing process. A retained crash can also be reopened from Diagnostics.

## Help/About
Help now covers the current feature set with task instructions. About adds Email ITthute and Open website actions for information@ITthute.Africa and https://ITthute.Africa.
